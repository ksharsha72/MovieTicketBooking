import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Theater } from '../theater';
import { UserApiServiceService } from '../user-api-service.service';

@Component({
  selector: 'app-show-theater-city',
  templateUrl: './show-theater-city.component.html',
  styleUrls: ['./show-theater-city.component.css']
})
export class ShowTheaterCityComponent implements OnInit {
  theaterList!:Array<Theater>;
  constructor(private _userApi:UserApiServiceService, private _router:Router) { }

  ngOnInit(): void {
    console.log("EnteredInit")
    let theaterCity:string;
    theaterCity=prompt("Enter City")!;
    console.log(theaterCity)
    this._userApi.getTheaterByCity(theaterCity).subscribe(
      (theaterList)=>{
        console.log(theaterCity);
        console.log(theaterList);
        this.theaterList=theaterList;
      }
    )
  }

  back()
  {
    this._router.navigate(['/customerComp']);
  }

}
