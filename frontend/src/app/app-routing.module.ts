import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { RegistrationComponent } from './registration/registration.component';
import { NavigationBarComponent } from './navigation-bar/navigation-bar.component';


const routes: Routes = [{
  path: '',
  component: HomeComponent
}, {
  path: 'registration', 
  component: RegistrationComponent
}, {
  path: 'navigation-bar',
  component: NavigationBarComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
