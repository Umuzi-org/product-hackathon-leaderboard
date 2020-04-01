import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import{ RatingSystemComponent } from './rating-system/rating-system.component'
import { LeaderboardComponent } from './leaderboard/leaderboard.component';

const routes: Routes = [
 {
  path:'leaderBoard',component:LeaderboardComponent
 },
 {
  path:'ratingSystem', component:RatingSystemComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}