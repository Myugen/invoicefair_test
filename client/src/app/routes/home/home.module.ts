import { NgModule } from '@angular/core';

import { SharedModule } from 'src/app/shared';

import { HomeRoutingModule } from './home-routing.module';
import { HomeComponent } from './home.component';
import { ChildComponent } from './components/child/child.component';

@NgModule({
  imports: [HomeRoutingModule, SharedModule],
  exports: [],
  declarations: [HomeComponent, ChildComponent],
  providers: [],
})
export class HomeModule { }
