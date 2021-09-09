import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TalksComponent } from './talks.component';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [TalksComponent],
  imports: [CommonModule, FormsModule, IonicModule],
  exports: [TalksComponent],
})
export class TalksModule {}
