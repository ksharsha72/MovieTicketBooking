import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerDataService } from '../customer-data.service';
import { Movie } from '../movie';
import { UserApiServiceService } from '../user-api-service.service';

@Component({
  selector: 'app-show-movie',
  templateUrl: './show-movie.component.html',
  styleUrls: ['./show-movie.component.css']
})
export class ShowMovieComponent implements OnInit {
  movieList!:Array<Movie>;
  constructor(private _userApi:UserApiServiceService,private _router:Router) { }

  ngOnInit(): void {

    this._userApi.getAllMovie().subscribe(
      (movieList)=>{
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
