import { Pipe, PipeTransform } from '@angular/core';
import { Currency } from 'src/app/models/currency';

@Pipe({
  name: 'currency'
})

export class CurrencyPipe implements PipeTransform {
  transform(value: number, currency: Currency): any {
    const selectedCurrency = currency || Currency.EUR;
    return new Intl.NumberFormat('en-US', { style: 'currency', currency: selectedCurrency }).format(value);
  }
}
