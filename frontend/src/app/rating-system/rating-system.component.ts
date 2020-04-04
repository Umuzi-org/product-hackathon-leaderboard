import { Component, OnInit } from '@angular/core';
import userdata from '../assets/users.json'

interface Ranking {
  value: number;
  viewValue: string;
}
@Component({
  selector: 'app-rating-system',
  templateUrl: './rating-system.component.html',
  styleUrls: ['./rating-system.component.css']
})
export class RatingSystemComponent implements OnInit {
  ngOnInit() {
  }
  rankings: Ranking[] = [
    {value: 3, viewValue:'First'},
    {value: 2, viewValue:'Second'},
    {value: 1, viewValue:'Third'},
    {value: 0, viewValue:'Other'}
  ];
  title = 'read-json-users'
  users: any = userdata;
  public assignValue(pos:number,player:string) {
    for(var index=0;index<this.users.length;index++){
      var current_user = this.users[index].name.toLowerCase();
      var player_toLower = player.toLowerCase();
      
      if(player_toLower == current_user){
        this.users[index].points=this.users[index].points+pos;
        this.users[index].pointsInLastMonth=this.users[index].pointsInLastMonth+pos;
        var json = JSON.stringify(userdata);
        console.log(json);
        return json;
      }
      if(index==this.users.length-1){
        alert("User '"+player+"' not found!\nplease input your full names");
      }
    }
  }
}