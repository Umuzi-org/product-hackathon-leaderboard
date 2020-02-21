import { Component, OnInit } from '@angular/core';
import { user } from '../models/users'
@Component({
  selector: 'app-leaderboard',
  templateUrl: './leaderboard.component.html',
  styleUrls: ['./leaderboard.component.css']
})
export class LeaderboardComponent implements OnInit {
  users:user[];
  constructor() { }
  ngOnInit(): void {
    this.users=[
      {
        rank: 1,
        name: 'John Doe',
        points: 200,
        pointsInLastMonth:55
      },
      {
        rank: 2,
        name: 'Jurgen Klopp',
        points: 200,
        pointsInLastMonth:50
      },
      {
        rank: 3,
        name: 'Mike Joe',
        points: 195,
        pointsInLastMonth:53
      },
      {
        rank: 4,
        name: 'Michael Jackson',
        points: 190,
        pointsInLastMonth:15
      },
      {
        rank: 5,
        name: 'Mickey Doe',
        points: 176,
        pointsInLastMonth:14
      },
      {
        rank: 6,
        name: 'Sam Smith',
        points: 155,
        pointsInLastMonth:8
      },
      {
        rank: 7,
        name: 'Sam Sue',
        points: 115,
        pointsInLastMonth:17
      },
      {
        rank: 8,
        name: 'John Brown',
        points: 115,
        pointsInLastMonth:10
      },
      {
        rank: 9,
        name: 'Frank Jim',
        points: 98,
        pointsInLastMonth:8
      },
      {
        rank: 10,
        name: 'Bob Simpson',
        points: 75,
        pointsInLastMonth:12
      }
    ]
  }
}
