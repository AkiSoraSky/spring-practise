<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
	<h1>Your Todo's are</h1>
	<div class="table">
		<table>
			<thead>
				<tr>
					<th>id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
				<tbody>
					<c:forEach items="${todos}" var="todos">
						<tr>
							<td>${todos.id}</td>
							<td>${todos.description}</td>
							<td>${todos.targetDate}</td>
							<td>${todos.done}</td>
							<td> <a href="update-todo?id=${todos.id}" class="btn btn-success">Update</a></td>
							<td> <a href="delete-todo?id=${todos.id}" class="btn btn-warning">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="add-todo" class="btn btn-success">Add Todo's</a>
		</div>
</div>	
<%@ include file="common/footer.jspf" %>
</html>