import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';



@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {
  public validationMessages: { [key: string]: { [key: string]: string } } = {};
  public formErrors: { [key: string]: string } = {};
  form!: FormGroup

  constructor(private formBuilder: FormBuilder) {

  }

  ngOnInit() {
    this.form = this.formBuilder.group({
      email: ['', [
        Validators.required,
        Validators.email]],
      userName: ['', [
        Validators.required,
        Validators.minLength(6),
        Validators.maxLength(15),
        Validators.pattern('^[a-zA-Z0-9]*$')]],
      password: ['', [
        Validators.required,
        Validators.maxLength(15),
        Validators.pattern('^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,}$')]]

    });
  }


  registerClicked(): void {
    if (this.form.invalid) {
      alert('Invalid Login:Attempt failed');
      return;
    }
    alert('Login Complete');
  }
}

