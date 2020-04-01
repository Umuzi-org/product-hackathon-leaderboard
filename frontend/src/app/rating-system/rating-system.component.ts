import { Component } from '@angular/core';
import { user } from '../models/user.model'
interface Ranking {
  value: number;
  viewValue: string;
}
@Component({
  selector: 'app-rating-system',
  templateUrl: './rating-system.component.html',
  styleUrls: ['./rating-system.component.css']
})

export class RatingSystemComponent {
  users:user[];
  ngOnInit(): void{
    this.users=[
      {
        rank:1,
        name:'Kagiso Raseroka',
        points: 35,
        pointsInLastMonth: 10
      }
    ]
  }
  rankings: Ranking[] = [
    {value: 3, viewValue:'First'},
    {value: 2, viewValue:'Second'},
    {value: 1, viewValue:'Third'},
    {value: 0, viewValue:'Other'}
  ];
  assignValue(params:number) {
    if(params!=undefined){
      this.users[0].points=this.users[0].points+params
      this.users[0].pointsInLastMonth=this.users[0].pointsInLastMonth+params
    }
    alert(this.users[0].points)
  }
}