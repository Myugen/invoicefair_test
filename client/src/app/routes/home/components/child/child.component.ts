import { Component, EventEmitter, OnInit, Output } from '@angular/core';

type User = {displayName: string, username: string};
@Component({
  selector: 'app-child',
  templateUrl: 'child.component.html'
})
export class ChildComponent implements OnInit {
  public name: string;
  public users: User[] = [];
  public selectedUser: User;

  @Output()
  public selectedUsername = new EventEmitter<string>();


  constructor() { }

  ngOnInit(): void {
    this.name = 'Child';
    this.users = [{displayName: 'Test User 1', username: 'user1'}, {displayName: 'Test User 2', username: 'user2'}];
    this.selectedUser = this.users[0];
  }

  onChangeMethod(username: string): void {
    this.selectedUsername.emit(username);
  }
}
