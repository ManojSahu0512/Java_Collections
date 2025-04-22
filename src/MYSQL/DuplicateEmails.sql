-- Write a solution to report all the duplicate emails. Note that it's guaranteed that the email field is not NULL.

select email as Email
from Person
group by email
having count(email)>1;