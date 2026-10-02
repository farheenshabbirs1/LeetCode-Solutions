class Solution:
    def minSessions(self, tasks, sessionTime):
        n = len(tasks)
        full = (1 << n) - 1

        # Larger tasks first -> better pruning
        tasks.sort(reverse=True)

        memo = {}

        def dfs(mask, remaining):
            if mask == full:
                return 1

            key = (mask, remaining)
            if key in memo:
                return memo[key]

            ans = float('inf')

            for i in range(n):
                if mask & (1 << i):
                    continue

                task = tasks[i]

                if task <= remaining:
                    ans = min(
                        ans,
                        dfs(mask | (1 << i), remaining - task)
                    )
                else:
                    ans = min(
                        ans,
                        1 + dfs(mask | (1 << i),
                                sessionTime - task)
                    )

            memo[key] = ans
            return ans

        return dfs(0, sessionTime)