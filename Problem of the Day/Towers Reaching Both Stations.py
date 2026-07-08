class Solution:
    def countCoordinates(self, mat):
        n = len(mat)
        m = len(mat[0])

        p = [[False] * m for _ in range(n)]
        q = [[False] * m for _ in range(n)]

        dirs = [(1, 0), (-1, 0), (0, 1), (0, -1)]

        def bfs(starts, vis):
            dq = deque(starts)

            while dq:
                x, y = dq.popleft()

                for dx, dy in dirs:
                    nx, ny = x + dx, y + dy

                    if (0 <= nx < n and 0 <= ny < m and
                        not vis[nx][ny] and
                        mat[nx][ny] >= mat[x][y]):
                        vis[nx][ny] = True
                        dq.append((nx, ny))

        p_starts = []
        q_starts = []

        # Top and Bottom rows
        for j in range(m):
            if not p[0][j]:
                p[0][j] = True
                p_starts.append((0, j))

            if not q[n - 1][j]:
                q[n - 1][j] = True
                q_starts.append((n - 1, j))

        # Left and Right columns
        for i in range(n):
            if not p[i][0]:
                p[i][0] = True
                p_starts.append((i, 0))

            if not q[i][m - 1]:
                q[i][m - 1] = True
                q_starts.append((i, m - 1))

        bfs(p_starts, p)
        bfs(q_starts, q)

        ans = 0
        for i in range(n):
            for j in range(m):
                if p[i][j] and q[i][j]:
                    ans += 1

        return ans
