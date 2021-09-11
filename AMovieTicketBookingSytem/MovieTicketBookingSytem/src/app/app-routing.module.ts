import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddAdminComponent } from './add-admin/add-admin.component';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { AddTheaterComponent } from './add-theater/add-theater.component';
import { AdminComponent } from './admin/admin.component';
import { CustomerCompComponent } from './customer-comp/customer-comp.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ShowAdminComponent } from './show-admin/show-admin.component';
import { ShowCustomerComponent } from './show-customer/show-customer.component';
import { ShowMovieTheaterComponent } from './show-movie-theater/show-movie-theater.component';
import { ShowMovieComponent } from './show-movie/show-movie.component';
import { ShowTheaterCityComponent } from './show-theater-city/show-theater-city.component';
import { ShowTheaterComponent } from './show-theater/show-theater.component';

const routes: Routes = [

  {
    path:'login', component:LoginComponent
  },
  {
    path:'register', component:RegisterComponent
  },
  {
    path:'admin' , component:AdminComponent
  },
  {
    path:'customerComp' , component:CustomerCompComponent
  },
  {
    path:'addTheater' , component:AddTheaterComponent
  },
  {
    path:'addMovie' , component:AddMovieComponent
  },
  {
    path:'showMovie' , component:ShowMovieComponent
  },
  {
    path:'showTheater' , component:ShowTheaterComponent
  },
  {
    path:'showTheaterCity' , component:ShowTheaterCityComponent
  },
  {
    path:'home', component:HomeComponent
  },
  {
    path:'addAdmin' , component:AddAdminComponent
  },
  {
    path:'showAdmin' , component:ShowAdminComponent
  },
  {
    path:'showCustomer' , component:ShowCustomerComponent
  },
  {
    path:'showMovieTheater' , component:ShowMovieTheaterComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
