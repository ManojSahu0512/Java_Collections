
--Triangle Judgement

select *,
    CASE when x+y>z and y+z>x and x+z>y then "Yes"
         Else "No"
    END as  triangle
    from Triangle;

