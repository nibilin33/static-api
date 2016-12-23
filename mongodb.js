use luckypandadas
show dbs
db.luckypandadas.insert({"name":"nibilin","password":"123456"})
db.luckypandadas.find().pretty()
show collections
db.luckypandadas.renameCollection("User")
db.User.find()
db.User.remove({"name":"nibilin"})
db.User.insert({"name":"nibilin","password":"123456","age":23})
for(var i=0;i<30;i++)
db.User.save({"name":"nibilin"+i,"password":"123456","age":20+i});
var cursor=db.User.find();
for(var i=0;i<cursor.length();i++)
printjson(cursor[i]);
db.User.find({"age":{$gte:27}}).count();
db.User.findOne();
db.User.update({"name":"nibilin"},{$inc:{"age":10}},false,true)
db.User.find({"name":"nibilin"})
db.User.find().limit(10).skip(4)