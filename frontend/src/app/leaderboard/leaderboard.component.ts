import { Component, OnInit } from '@angular/core';
import userdata from '../assets/users.json'
@Component({
  selector: 'app-leaderboard',
  templateUrl: './leaderboard.component.html',
  styleUrls: ['./leaderboard.component.css']
})
export class LeaderboardComponent implements OnInit {
  users: any = userdata;
  ngOnInit(): void {}
}