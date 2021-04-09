import { Currency } from './currency';

export class Balance {
  constructor(public account: Account, public totals: Total[]) {}
}

type Total = {
  currency: Currency
  balance: number;
  toEurRate: number;
};

type Account = {
  reference: string;
  displayName: string;
};
