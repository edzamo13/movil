import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-success',
  templateUrl: './success.page.html',
  styleUrls: ['./success.page.scss'],
})
export class SuccessPage implements OnInit {
  info: any;
  constructor(private router: Router, private activatedRoute: ActivatedRoute) {
    if (this.router.getCurrentNavigation().extras.state) {
      const state = this.router.getCurrentNavigation().extras.state;
      //  this.member = state.member ? JSON.parse(state.member) : '';
      //this.type = state.type ? state.type : '';
      this.info = state.talks ? state.talks : '';
    }
  }

  ngOnInit() {}
}
