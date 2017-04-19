var serviceModule=angular.module("ServiceCart",[]);
serviceModule.service("AddService",function()
{
	var AddedProducts=[];
	this.addProduct=function(pObj)
	{
		AddedProducts.push(pObj);
		console.log(pObj);
	};
	
	this.getProducts=function()
	{
		return AddedProducts;
	};
	
	this.deleteProduct=function(id)
	{
		AddedProducts.forEach(function(p,i){
			if(p.Id==id)
				{
				AddedProducts.splice(i,1);
				}
		});
	};
	
	this.totalAmount=function(){
		var total=0;
		console.log(AddedProducts.length);
		    for(var i = 0; i < AddedProducts.length; i++){
		       
		        total += AddedProducts[i].price;
		    }
		    return total;
	};
		
});
