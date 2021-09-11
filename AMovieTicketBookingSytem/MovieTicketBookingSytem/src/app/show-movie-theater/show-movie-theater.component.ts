import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Movie } from '../movie';
import { UserApiServiceService } from '../user-api-service.service';

@Component({
  selector: 'app-show-movie-theater',
  templateUrl: './show-movie-theater.component.html',
  styleUrls: ['./show-movie-theater.component.css']
})
export class ShowMovieTheaterComponent implements OnInit {

  movieList!:Array<Movie>;
  constructor(private _userApi:UserApiServiceService, private _router:Router) { }

  ngOnInit(): void {
    console.log("EnteredInit")
    let theaterName:string;
    theaterName=prompt("Enter Theater Name")!;
    console.log(theaterName)
    this._userApi.getMovieByTheater(theaterName).subscribe(
      (movieList)=>{
        console.log(theaterName);
        console.log(movieList);
        this.movieList=movieList;
      }
    )
  }

  back()
  {
    this._router.navigate(['/customerComp']);
  }

}
