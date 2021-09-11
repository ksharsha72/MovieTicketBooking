import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule,ReactiveFormsModule} from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AdminComponent } from './admin/admin.component';
import { CustomerCompComponent } from './customer-comp/customer-comp.component';
import { AddTheaterComponent } from './add-theater/add-theater.component';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { ShowTheaterComponent } from './show-theater/show-theater.component';
import { ShowMovieComponent } from './show-movie/show-movie.component';
import { ShowTheaterCityComponent } from './show-theater-city/show-theater-city.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import {HttpClientModule} from '@angular/common/http';
import { AddAdminComponent } from './add-admin/add-admin.component';
import { ShowAdminComponent } from './show-admin/show-admin.component';
import { ShowCustomerComponent } from './show-customer/show-customer.component';
import { UpdateTheaterComponent } from './update-theater/update-theater.component';
import { ShowMovieTheaterComponent } from './show-movie-theater/show-movie-theater.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    AdminComponent,
    CustomerCompComponent,
    AddTheaterComponent,
    AddMovieComponent,
    ShowTheaterComponent,
    ShowMovieComponent,
    ShowTheaterCityComponent,
    HomeComponent,
    AboutComponent,
    AddAdminComponent,
    ShowAdminComponent,
    ShowCustomerComponent,
    UpdateTheaterComponent,
    ShowMovieTheaterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
