import { Component } from '@angular/core';
// import { FormBuilder, Validators } from '@angular/forms';

interface Ranking {
  value: String;
  viewValue: string;
}
@Component({
  selector: 'app-rating-system',
  templateUrl: './rating-system.component.html',
  styleUrls: ['./rating-system.component.css']
})
export class RatingSystemComponent {
  rankings: Ranking[] = [
    {value: '1st', viewValue:'First'},
    {value: '2nd', viewValue:'Second'},
    {value: '3rd', viewValue:'Third'},
    {value: 'Other', viewValue:'Other'}
  ];
}
