import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Account } from 'src/app/models/account';
import { environment } from 'src/environments/environment';

@Injectable({providedIn: 'root'})
export class AccountService {
  constructor(private httpClient: HttpClient) {}

  findAll(): Observable<Account[]> {
    return this.httpClient.get<Account[]>(`${environment.serverEndpoint}/accounts`);
  }

}
