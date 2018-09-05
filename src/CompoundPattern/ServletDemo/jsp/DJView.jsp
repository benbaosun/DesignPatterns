<jsp:useBean id="beatModel" class="CompoundPattern.ServletDemo.controller.DJView"/>

<html>
<head>
    <title>DJ View</title>
</head>

<body>

<h1>DJ View</h1>
BPM值为：<jsp:getProperty name="beatModel" property="BPM"/>
<br>
<hr>

<form method="post" action="/CompoundPattern/ServletDemo/DJView">
    BPM: <input type="text" name="bpm" value="<jsp:getProperty name="beatModel" property="BPM"/>">
    <input type="submit" name="set" value="set"><br>
    <input type="submit" name="decrease" value="<<"><br>
    <input type="submit" name="increase" value=">>"><br>
    <input type="submit" name="on" value="on"><br>
    <input type="submit" name="off" value="off"><br>
</form>

</body>
</html>