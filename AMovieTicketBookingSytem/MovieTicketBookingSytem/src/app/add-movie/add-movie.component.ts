import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerDataService } from '../customer-data.service';
import { Movie } from '../movie';
import { UserApiServiceService } from '../user-api-service.service';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {

  constructor(private _userApi:UserApiServiceService, private _router:Router) { }

  ngOnInit(): void {
  }

  addM(movie:Movie){
    console.log("EnteredaddM")
    console.log(movie)
    this._userApi.addMovie(movie).subscribe(
      response=>{
        console.log(movie);
        alert("Movie Details Added..");
        this._router.navigate(['/admin']);
      }
    )
   
    

  }

}
