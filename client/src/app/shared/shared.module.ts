import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NbThemeModule, NbLayoutModule } from '@nebular/theme';
import { NbEvaIconsModule } from '@nebular/eva-icons';

@NgModule({
  imports: [
    CommonModule,
    NbThemeModule.forRoot({ name: 'default' }),
    NbLayoutModule,
    NbEvaIconsModule
  ],
  exports: [
    CommonModule,
    NbThemeModule,
    NbLayoutModule,
    NbEvaIconsModule
  ],
  declarations: [],
  providers: [],
})
export class SharedModule { }
