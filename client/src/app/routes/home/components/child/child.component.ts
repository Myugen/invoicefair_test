import { Component, EventEmitter, OnInit, Output } from '@angular/core';

import { AccountService } from 'src/app/core/services/account.service';
import { Account } from 'src/app/models/account';
@Component({
  selector: 'app-child',
  templateUrl: 'child.component.html'
})
export class ChildComponent implements OnInit {
  public name: string;
  public users: Account[] = [];
  public selectedUser: Account;

  @Output()
  public selectedUsername = new EventEmitter<string>();


  constructor(private accountService: AccountService) { }

  ngOnInit(): void {
    this.name = 'Child';

    this.accountService.findAll().subscribe((response) => {
      this.users = response;
      this.selectedUser = response[0];
    });
  }

  onChangeMethod(username: string): void {
    this.selectedUsername.emit(username);
  }
}
