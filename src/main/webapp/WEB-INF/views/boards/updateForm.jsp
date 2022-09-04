<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form action="/boards/update" method="post">
		<div class="mb-3 mt-3">
			<input type="text" class="form-control" placeholder="Enter title" name="title">
		</div>
		<div class="mb-3">
			<textarea class="form-control" rows="8" placeholder="Enter content" name="content"></textarea>
		</div>
		<div class="mb-3 mt-3">
			<input type="hidden" class="form-control" value="${boards.id}" name="id">
		</div>
		<button type="submit" class="btn btn-primary">글 수정완료</button>
	</form>
</div>

<%@ include file="../layout/footer.jsp"%>