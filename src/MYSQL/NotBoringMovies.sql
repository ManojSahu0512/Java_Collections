
--Not Boring Movies

select * from Cinema
where MOD(id,2) !=0
and description !="boring"
order by rating desc;

