
--Biggest Single Number
select MAX(num) as num
from
(select num from MyNumbers group by num
having count(*)=1

)as singleNum;

