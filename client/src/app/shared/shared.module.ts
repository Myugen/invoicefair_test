import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NbThemeModule, NbLayoutModule, NbSelectModule } from '@nebular/theme';
import { NbEvaIconsModule } from '@nebular/eva-icons';
import { CurrencyPipe } from './pipes/currency.pipe';

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
    CurrencyPipe,
    NbThemeModule,
    NbLayoutModule,
    NbEvaIconsModule,
    NbSelectModule
  ],
  declarations: [CurrencyPipe],
  providers: [],
})
export class SharedModule { }
