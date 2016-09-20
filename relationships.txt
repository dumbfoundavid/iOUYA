User class:
ID			<String>
Name			<String>
*Username		<String>
*Password		<String>
Photo			<String>
Tree 			<Tree>
Friends			<List>


Tree Class:
ID			<String>
Owner			<User>
Root			<Node>


Node Class:
ID			<String>
Parent			<Node>
Children		<List>
Helped			<User>
QR Code			<?>



Views:
-Login
-MyTree
-Profile
-Friends
	-Add Friends
	-Their Tree
-QR Scanner
-QR Code
