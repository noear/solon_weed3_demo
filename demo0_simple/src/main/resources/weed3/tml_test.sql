#if(id == 1)
    select * from demo where id =@{id}
#else
    select #(id) as id
#end