import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NbThemeModule, NbLayoutModule, NbSelectModule } from '@nebular/theme';
import { NbEvaIconsModule } from '@nebular/eva-icons';

@NgModule({
  imports: [
    CommonModule,
    NbThemeModule.forRoot({ name: 'default' }),
    NbLayoutModule,
    NbEvaIconsModule,
    NbSelectModule
  ],
  exports: [
    CommonModule,
    NbThemeModule,
    NbLayoutModule,
    NbEvaIconsModule,
    NbSelectModule
  ],
  declarations: [],
  providers: [],
})
export class SharedModule { }
