import { Component, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { NavController } from '@ionic/angular';
import { TalksService } from '../talks/talks.service';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  constructor(private talksService: TalksService, private router: Router) {}

  onSumit(title, date) {
    this.talksService.save(title, date).subscribe((x) => console.log(x));
   /* this.router.navigate(['success'], {
      talks: {
        title: title,
        date: date,
      },
    });
*/
    this.router.navigate(['/success'], {
      state: {
        talks:{
          title,
          date
        }
      }
    });
  }
}
