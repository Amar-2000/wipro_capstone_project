import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginSignupComponent } from './Pages/login-signup/login-signup.component';
import { DashboardComponent } from './Pages/dashboard/dashboard.component';

import { AvailablebusComponent } from './Pages/availablebus/availablebus.component';
import { PaymentComponent } from './Pages/payment/payment.component';

const routes: Routes = [{
  path:'',
  redirectTo:'loginsignup',
  pathMatch: 'full'
},
{
  path:'loginsignup',
  component: LoginSignupComponent

},
{
  path:'dashboard',
  component: DashboardComponent

},
{
  path:'availablebus',
  component: AvailablebusComponent

},
{
  path:'payment',
  component: PaymentComponent

}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
