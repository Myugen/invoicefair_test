import { Component, OnInit } from '@angular/core';

import { BalanceService } from 'src/app/core/services/balance.service';
import { Balance } from 'src/app/models/balance';

@Component({
  selector: 'app-home',
  templateUrl: 'home.component.html'
})

export class HomeComponent implements OnInit {
  public name: string;
  public mail: string;
  public totalBalance: number;

  constructor(private balanceService: BalanceService) {}

  ngOnInit(): void {
    this.name = 'Parent';
  }

  onSelectUsername(username: string): void {
    this.balanceService.findBalance(username).subscribe((balance) => {
      this.mail = balance?.account.reference;
      this.totalBalance = balance?.totals?.reduce((accumulator, current) => accumulator + (current.balance * current.toEurRate), 0);
    });
  }
}
