import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerDataService } from '../customer-data.service';
import { Movie } from '../movie';
import { Theater } from '../theater';

@Component({
  selector: 'app-customer-comp',
  templateUrl: './customer-comp.component.html',
  styleUrls: ['./customer-comp.component.css']
})
export class CustomerCompComponent implements OnInit {

  theaterCityList:Array<string>=[];
  movieTheaterList:Array<string>=[];

  constructor(public customerData:CustomerDataService,private _router:Router) { }

  ngOnInit(): void {
  }

  showT()
  {
    this._router.navigate(['/showTheater']);
  }

  showM()
  {
    this._router.navigate(['/showMovie']);
  }

  showTC()
  {
    this._router.navigate(['/showTheaterCity']);
  }

  showMT()
  {
    this._router.navigate(['/showMovieTheater']);
  }
  
  logOut():any
  {
    this._router.navigate(['/login']);
  }
}
