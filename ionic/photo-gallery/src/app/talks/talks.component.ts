import { Component, OnInit } from '@angular/core';
import { TalksService } from './talks.service';

@Component({
  selector: 'app-talks',
  templateUrl: './talks.component.html',
  styleUrls: ['./talks.component.scss'],
})
export class TalksComponent implements OnInit {
  listTalks: any;

  constructor(private talksService: TalksService) {}

  ngOnInit() {
    this.recuperarEntrada();
  }

  private recuperarEntrada(): void {
    this.talksService.allTalks().subscribe(
      (data) => {
        this.listTalks = data;
      },
      (error) => {},
      () => {}
    );
  }

}
