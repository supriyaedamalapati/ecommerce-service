import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginpageComponent } from './loginpage/loginpage.component';
import { RegisterpageComponent } from './registerpage/registerpage.component';



@NgModule({
  declarations: [
    LoginpageComponent,
    RegisterpageComponent
  ],
  imports: [
    CommonModule
  ]
})
export class RegistrationModule { }
