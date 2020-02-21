import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LeaderboardComponent } from './leaderboard/leaderboard.component';

const routes: Routes = [
 {
   path:'leaderBoard',component:LeaderboardComponent
 }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
