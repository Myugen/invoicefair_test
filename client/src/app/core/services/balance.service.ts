import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Balance } from 'src/app/models/balance';
import { environment } from 'src/environments/environment';

@Injectable({providedIn: 'root'})
export class BalanceService {
  constructor(private httpClient: HttpClient) {}

  findBalance(username: string): Observable<Balance> {
    return this.httpClient.get<Balance>(`${environment.serverEndpoint}/balances/${username}`);
  }

}
