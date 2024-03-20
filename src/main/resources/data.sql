TRUNCATE TABLE coupon;

INSERT INTO coupon (title, description, start_date, end_date, operator, value)
VALUES ('Spring Sale', 'Save 20% on your next purchase', '2024-03-20 00:00:00', '2024-03-27 23:59:59', 'DISCOUNT', 0.20),
       ('Summer Offer', 'Get 15% off selected items', '2024-06-01 00:00:00', '2024-06-30 23:59:59', 'DISCOUNT', 0.15),
       ('Limited Time', 'Extra 10% off', '2024-03-22 12:00:00', '2024-03-23 12:00:00', 'DISCOUNT', 0.10);