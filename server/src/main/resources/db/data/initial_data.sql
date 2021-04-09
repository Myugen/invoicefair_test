INSERT INTO currencies (id, currency, conversors)
VALUES (nextval('seq_currency_id'), 'EUR', '{ "EUR": 1 }'), -- currency_id: 1
       (nextval('seq_currency_id'), 'GBP', '{ "EUR": 1.17 }'), -- currency_id: 51
       (nextval('seq_currency_id'), 'USD', '{ "EUR": 0.89 }'); -- currency_id: 101

INSERT INTO accounts (id, username, "reference", "name", last_name)
VALUES (nextval('seq_account_id'), 'user1','user1@invoicefair.com', 'Test', 'User 1'), -- account_id: 1
       (nextval('seq_account_id'), 'user2','user2@invoicefair.com', 'Test', 'User 2'); -- account_id: 51

INSERT INTO totals (id, balance, currency_id, account_id)
VALUES (nextval('seq_total_id'), 32500.2243, 1, 1), -- total_id: 1
       (nextval('seq_total_id'), 88300.1824, 51, 1), -- total_id: 51
       (nextval('seq_total_id'), 54403.7169, 1, 51), -- total_id: 101
       (nextval('seq_total_id'), 120.1533, 101, 51); -- total_id: 151