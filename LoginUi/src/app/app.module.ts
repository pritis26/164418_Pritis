import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AppRegisterComponent } from './component/app-register/app-register.component';
import { LoginComponent } from './component/app-login/app-login.component';
import { HomeComponent } from './component/app-home/app-home.component';
import { Route, RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ProductComponent } from './component/product/product.component';
import { HeaderComponent } from './component/header/header.component';
import { FooterComponent } from './component/footer/footer.component';
import { NewProductComponent } from './component/new-product/new-product.component';
@NgModule({
  declarations: [
    AppComponent,
    AppRegisterComponent,
    LoginComponent,
    HomeComponent,
    ProductComponent,
    HeaderComponent,
    FooterComponent,
    NewProductComponent,


    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    ReactiveFormsModule,
    FormsModule,
   
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
