-- ==============================
-- Issuers
-- ==============================
INSERT INTO issuer_entity (id, country, currency, continent, rating) VALUES
(1, 'USA', 'USD', 'North America', 'AAA'),
(2, 'Germany', 'EUR', 'Europe', 'AA'),
(3, 'Japan', 'JPY', 'Asia', 'A+'),
(4, 'United Kingdom', 'GBP', 'Europe', 'AA+'),
(5, 'France', 'EUR', 'Europe', 'AA'),
(6, 'Canada', 'CAD', 'North America', 'AAA'),
(7, 'Australia', 'AUD', 'Oceania', 'AA+'),
(8, 'India', 'INR', 'Asia', 'BBB'),
(9, 'Brazil', 'BRL', 'South America', 'BB+'),
(10, 'Mexico', 'MXN', 'North America', 'BBB+'),
(11, 'South Africa', 'ZAR', 'Africa', 'BB'),
(12, 'China', 'CNY', 'Asia', 'A+'),
(13, 'Italy', 'EUR', 'Europe', 'BBB'),
(14, 'Spain', 'EUR', 'Europe', 'BBB+'),
(15, 'Switzerland', 'CHF', 'Europe', 'AAA'),
(16, 'Sweden', 'SEK', 'Europe', 'AA+'),
(17, 'Norway', 'NOK', 'Europe', 'AAA'),
(18, 'Russia', 'RUB', 'Europe', 'BB'),
(19, 'Singapore', 'SGD', 'Asia', 'AAA'),
(20, 'South Korea', 'KRW', 'Asia', 'AA');

-- ==============================
-- Bonds
-- ==============================
INSERT INTO bond_entity (id, expiry_date, face_value, cost_price, ticker, description, issue_date, issuer_id) VALUES
(1, '2030-12-31', 1000, 950, 'US10Y', '10-Year US Treasury Bond', '2020-01-01', 1),
(2, '2028-06-30', 500, 480, 'DE5Y', '5-Year German Government Bond', '2023-06-30', 2),
(3, '2035-03-15', 2000, 1800, 'JP20Y', '20-Year Japanese Bond', '2015-03-15', 3),
(4, '2032-09-30', 1200, 1100, 'UK10Y', 'UK 10-Year Gilt', '2022-09-30', 4),
(5, '2031-01-01', 1500, 1400, 'FR10Y', 'French 10-Year Bond', '2021-01-01', 5),
(6, '2029-05-20', 800, 750, 'CA5Y', 'Canada 5-Year Bond', '2024-05-20', 6),
(7, '2033-11-11', 1000, 920, 'AU10Y', 'Australia 10-Year Bond', '2023-11-11', 7),
(8, '2037-07-01', 2500, 2200, 'IN15Y', 'India 15-Year Government Bond', '2022-07-01', 8),
(9, '2030-02-15', 600, 550, 'BR7Y', 'Brazil 7-Year Bond', '2023-02-15', 9),
(10, '2028-12-01', 900, 850, 'MX5Y', 'Mexico 5-Year Bond', '2023-12-01', 10),
(11, '2035-04-10', 1300, 1200, 'ZA12Y', 'South Africa 12-Year Bond', '2023-04-10', 11),
(12, '2040-01-01', 3000, 2700, 'CN20Y', 'China 20-Year Government Bond', '2020-01-01', 12),
(13, '2032-08-20', 1100, 1020, 'IT10Y', 'Italy 10-Year Bond', '2022-08-20', 13),
(14, '2029-03-25', 950, 880, 'ES7Y', 'Spain 7-Year Bond', '2022-03-25', 14),
(15, '2038-10-15', 2000, 1800, 'CH15Y', 'Switzerland 15-Year Bond', '2023-10-15', 15),
(16, '2034-06-01', 1400, 1300, 'SE12Y', 'Sweden 12-Year Bond', '2022-06-01', 16),
(17, '2031-09-30', 1700, 1600, 'NO10Y', 'Norway 10-Year Bond', '2021-09-30', 17),
(18, '2036-02-10', 2200, 2000, 'RU15Y', 'Russia 15-Year Bond', '2021-02-10', 18),
(19, '2029-12-31', 800, 780, 'SG5Y', 'Singapore 5-Year Bond', '2024-12-31', 19),
(20, '2033-11-05', 1250, 1150, 'KR10Y', 'South Korea 10-Year Bond', '2023-11-05', 20);
