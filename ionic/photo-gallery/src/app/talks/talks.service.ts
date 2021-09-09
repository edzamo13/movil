import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class TalksService {
  constructor(private httpClient: HttpClient) {}

  public allTalks(): Observable<any> {
    return this.httpClient.get<any>(
      'https://jsonplaceholder.typicode.com/posts'
    );
  }

  save(title, date): Observable<any> {
    return this.httpClient.post<any>(
      'https://jsonplaceholder.typicode.com/posts',{
        title,
        date,
        userId: 1,
      }
    );
  }
}
