import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.component.html'
})

export class HomeComponent implements OnInit {
  public name: string;
  constructor() { }

  ngOnInit(): void {
    this.name = 'Parent';
  }
}
