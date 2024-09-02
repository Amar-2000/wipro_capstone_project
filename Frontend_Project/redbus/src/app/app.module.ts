import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AvailablebusComponent } from './Pages/availablebus/availablebus.component';
import { LayoutComponent } from './Pages/layout/layout.component';
import { PaymentComponent } from './Pages/payment/payment.component';
import { DashboardComponent } from './Pages/dashboard/dashboard.component';
import { LoginSignupComponent } from './Pages/login-signup/login-signup.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AvailablebusComponent,
    LayoutComponent,
    PaymentComponent,
    DashboardComponent,
    LoginSignupComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
  FormsModule
    
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
