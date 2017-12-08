<!DOCTYPE html>
<html>
    <head>
        <title>AgriculturalProducts</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
    </head>
    <body>
        <label for="example-text-input">请输入产品信息：</label>
        <form name="productForm" action="/AgriculturalProducts/pages/solve" method="post">
        	<label for="example-text-input">id:</label>
        	<input type="text" name="id"><br/>
            <label for="example-text-input">name:</label>
            <input type="text" name="name"><br/>  
            <label for="example-text-input">price:</label>
            <input type="text" name="price"><br/>  
            <label for="example-text-input">stock:</label>
            <input type="text" name="stock"><br/>  
            <label for="example-text-input">description: </label>
            <input type="text" name="description"><br/>
            <label for="example-text-input">type:</label>
            <input type="text" name="type"><br/>
            <input type="submit" class="btn btn-info" value="提交并生成二维码">
        </form>
        
        <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdn.bootcss.com/popper.js/1.9.3/umd/popper.min.js" integrity="sha384-knhBOwpf8/28D6ygAjJeb0STNDZqfPbKaWQ8wIz/xgSc0xXwKsKhNype8fmfMka2" crossorigin="anonymous"></script>
		<script src="https://cdn.bootcss.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
    </body>
</html>