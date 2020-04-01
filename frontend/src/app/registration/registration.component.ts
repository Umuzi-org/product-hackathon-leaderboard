import { Component, OnInit } from '@angular/core';
import { RegistrationModel } from '../models/registration.model';
import { FormGroup, FormBuilder, Validators} from '@angular/forms';

interface Department {
  value: string;
  viewValue: string;
}

interface Gender {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  user: RegistrationModel = new RegistrationModel();
  registrationForm:  FormGroup; 
  hide = true;
  selectedDepartment: string;

  departments: Department[] = [
    {value: 'dataScience-0', viewValue: 'Data Science'},
    {value: 'dataEngineering-1', viewValue: 'Data Engineering'},
    {value: 'webDevelopment-2', viewValue: 'Web Development'},
    {value: 'java-3', viewValue: 'Java'}
  ];

  genders: Gender[] = [
    {value: 'male-0', viewValue: 'Male'},
    {value: 'female-1', viewValue: 'Female'}
  ]

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.registrationForm = this.formBuilder.group({
      'firstName':[this.user.firstName, [
        Validators.required
      ]],
      'lastName':[this.user.lastName, [
        Validators.required
      ]],
      'email': [this.user.email, [
        Validators.required,
        Validators.email
      ]],
      'reTypeEmail': [this.user.reTypeEmail, [
        Validators.required,
        Validators.email
      ]],
      'password': [this.user.password, [
        Validators.required,
        Validators.minLength(8),
        Validators.maxLength(30)
      ]],
      'reTypePassword': [this.user.reTypePassword, [
        Validators.required,
        Validators.minLength(8),
        Validators.maxLength(30)
      ]],
      'cohortNumber': [this.user.cohortNumber, [
        Validators.required
      ]],
      'department': [this.user.department, [
        Validators.required
      ]],
      'gender': [this.user.gender, [
        Validators.required
      ]]
    });
  }

  onRegistrationSubmit() {
    alert("User registered!!!")
  }

}
