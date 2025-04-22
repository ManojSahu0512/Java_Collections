


-- write a solution to find the first login date for each


select player_id,MIN(event_date) as first_login
from Activity
group by player_id;














/*Table: Weather

  +---------------+---------+
  | Column Name   | Type    |
  +---------------+---------+
  | id            | int     |
  | recordDate    | date    |
  | temperature   | int     |
  +---------------+---------+
  id is the column with unique values for this table.
  There are no different rows with the same recordDate.
  This table contains information about the temperature on a certain day.


  Write a solution to find all dates' id with higher temperatures compared to its previous dates (yesterday).*/